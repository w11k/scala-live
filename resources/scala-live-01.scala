// 1.1 ----------------------------------------------------------

class Person(firstName: String, lastName: String)

// 1.2 ----------------------------------------------------------

class Person(firstName: String, lastName: String) {
  override def toString = "%s %s".format(firstName, lastName).trim
}

// 1.3 ----------------------------------------------------------

class Person(firstName: String = "", lastName: String = "") {
  override def toString = "%s %s".format(firstName, lastName).trim
}

// 1.4 ----------------------------------------------------------

class Person(firstName: String = "", lastName: String = "") {
  lazy val name = "%s %s".format(firstName, lastName).trim
  override def toString = name
}

// 1.5 ----------------------------------------------------------

class Person(val firstName: String = "", val lastName: String = "") {
  lazy val name = "%s %s".format(firstName, lastName).trim
  override def toString = name
}

// 1.6 ----------------------------------------------------------

class Person(var firstName: String = "", var lastName: String = "") {
  def name = "%s %s".format(firstName, lastName).trim
  override def toString = name
}

// 1.7 ----------------------------------------------------------

object Person {
  def apply(firstName: String = "", lastName: String = "") = new Person(firstName, lastName)
}
