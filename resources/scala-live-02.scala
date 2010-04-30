// 1.8 ----------------------------------------------------------

import org.specs.SpecificationWithJUnit

class PersonSpec extends SpecificationWithJUnit {

  "Creating a Person" should {
    "throw an IllegalArgumentException given a null firstName" in {
      new Person(null) must throwA[IllegalArgumentException]
    }
    "throw an IllegalArgumentException given a null lastName" in {
      new Person(lastName = null) must throwA[IllegalArgumentException]
    }
  }
}

class Person(var firstName: String = "", var lastName: String = "") {
  require(firstName != null, "firstName must not be null!")
  require(lastName != null, "lastName must not be null!")

// 1.9 ----------------------------------------------------------

  "Calling Person.toString" should {
    """return "John Doe" for firstName "John" and lastName "Doe" """ in {
      val John = "John"
      val Doe = "Doe"
      val person = new Person(John, Doe)
      person.toString mustEqual John + " " + Doe
    }
  }
