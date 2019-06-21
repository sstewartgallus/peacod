/*
 * Copyright 2019 Steven Stewart-Gallus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sstewartgallus.peacod.truffle.nodes.exprs.intrinsics.integers;

import com.oracle.truffle.api.dsl.CreateCast;
import com.oracle.truffle.api.dsl.ImportStatic;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.sstewartgallus.peacod.truffle.nodes.NodeUtils;
import com.sstewartgallus.peacod.truffle.nodes.exprs.PolyNode;
import com.sstewartgallus.peacod.truffle.nodes.exprs.strict.StrictNode;

@NodeChild(value = "left", type = PolyNode.class)
@NodeChild(value = "right", type = PolyNode.class)
@NodeInfo(shortName = "+")
@ImportStatic({NodeUtils.class})
abstract class AddNode extends StrictNode {

    @CreateCast({"left", "right"})
    static StrictNode force(PolyNode node) {
        return node.force();
    }

    @Specialization
    int addInt(VirtualFrame frame, int left, int right) {
        return left + right;
    }
}
