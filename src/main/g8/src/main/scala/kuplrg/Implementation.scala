package kuplrg

object Implementation extends Template {

  import Stmt.*, Expr.*, Value.*, BOp.*, Inst.*, Control.*, Error.*

  def step(st: State): State =
    val State(k, s, h, m) = st
    ???

  def locals(block: Block): Set[String] = ???
}
