// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ast/src/main/ast.proto

package com.sstewartgallus.peacod.ast;

public interface TypeExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:peacod_ast.TypeExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.peacod_ast.TypeExpr.Literal literal = 1;</code>
   */
  boolean hasLiteral();
  /**
   * <code>.peacod_ast.TypeExpr.Literal literal = 1;</code>
   */
  com.sstewartgallus.peacod.ast.TypeExpr.Literal getLiteral();
  /**
   * <code>.peacod_ast.TypeExpr.Literal literal = 1;</code>
   */
  com.sstewartgallus.peacod.ast.TypeExpr.LiteralOrBuilder getLiteralOrBuilder();

  /**
   * <code>.peacod_ast.TypeExpr.Variable variable = 2;</code>
   */
  boolean hasVariable();
  /**
   * <code>.peacod_ast.TypeExpr.Variable variable = 2;</code>
   */
  com.sstewartgallus.peacod.ast.TypeExpr.Variable getVariable();
  /**
   * <code>.peacod_ast.TypeExpr.Variable variable = 2;</code>
   */
  com.sstewartgallus.peacod.ast.TypeExpr.VariableOrBuilder getVariableOrBuilder();

  public com.sstewartgallus.peacod.ast.TypeExpr.ValueCase getValueCase();
}
