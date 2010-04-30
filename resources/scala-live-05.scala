// 3.1 ----------------------------------------------------------

abstract class Animal {
  def name: String
  override def toString = name
}

class DefaultAnimal(override val name: String) extends Animal
