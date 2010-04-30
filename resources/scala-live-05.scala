// 3.1 ----------------------------------------------------------

abstract class Animal {
  def name: String
  override def toString = name
}

class DefaultAnimal(override val name: String) extends Animal

// 3.2 ----------------------------------------------------------

class Bird(name: String) extends DefaultAnimal(name) {
  def fly = "I can fly!"
}

class Fish(name: String) extends DefaultAnimal(name) {
  def swim = "I can swim!"
}

class Duck(name: String) extends Bird(name)

// 3.3 ----------------------------------------------------------

trait CanSwim {
  def swim = "I can swim!"
}

class Fish(name: String) extends DefaultAnimal(name) with CanSwim

class Duck(name: String) extends Bird(name) with CanSwim
