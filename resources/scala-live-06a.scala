// 6a ----------------------------------------------------------

trait DAO[T]
object DAO {
  def clazz[T : Manifest](dao: DAO[T]) = implicitly[Manifest[T]].erasure
}
DAO.clazz(new DAO[String]{})
