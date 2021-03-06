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
package com.sstewartgallus.peacod.compiler;

import java.util.List;
import java.util.Objects;

public abstract class Form {
    private Form() {
    }

    public static Form list(List<Form> list) {
        var n = list.size();
        var form = empty();
        while (n > 0) {
            --n;
            form = cons(list.get(n), form);
        }
        return form;
    }

    static Form empty() {
        return Empty.SINGLETON;
    }

    private static Form cons(Form head, Form tail) {
        return new Cons(head, tail);
    }

    static Form atom(String value) {
        return new Atom(value);
    }

    static final class Empty extends Form {
        static final Empty SINGLETON = new Empty();

        private Empty() {
        }

        public String toString() {
            return "()";
        }
    }

    public static final class Cons extends Form {
        final Form head;
        final Form tail;

        private Cons(Form head, Form tail) {
            this.head = Objects.requireNonNull(head);
            this.tail = Objects.requireNonNull(tail);
        }

        public String toString() {
            var builder = new StringBuilder();

            builder.append('(');
            builder.append(head);

            var form = tail;
            while (form instanceof Cons) {
                var c = (Cons) form;
                var head = c.head;
                var tail = c.tail;
                builder.append(' ');
                builder.append(head);
                form = tail;
            }
            if (!(form instanceof Empty)) {
                throw new Error("malformed formed");
            }
            builder.append(')');
            return builder.toString();
        }
    }

    public static final class Atom extends Form {
        public final String value;

        private Atom(String value) {
            this.value = Objects.requireNonNull(value);
        }

        public String toString() {
            return value;
        }
    }
}
