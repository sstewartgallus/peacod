// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ast/src/main/ast.proto

package com.sstewartgallus.peacod.ast;

public interface TypeSchemeExprOrBuilder extends
        // @@protoc_insertion_point(interface_extends:peacod_ast.TypeSchemeExpr)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.peacod_ast.TypeExpr type = 1;</code>
     *
     * @return Whether the type field is set.
     */
    boolean hasType();

    /**
     * <code>.peacod_ast.TypeExpr type = 1;</code>
     *
     * @return The type.
     */
    com.sstewartgallus.peacod.ast.TypeExpr getType();

    /**
     * <code>.peacod_ast.TypeExpr type = 1;</code>
     */
    com.sstewartgallus.peacod.ast.TypeExprOrBuilder getTypeOrBuilder();

    /**
     * <code>uint32 arity = 2;</code>
     *
     * @return The arity.
     */
    int getArity();
}