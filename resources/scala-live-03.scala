// 1.10 ----------------------------------------------------------
// def persons(person: Person*) = person.toSeq

  implicit def stringToPerson(name: String) = Person(name)

  """The string "John" """ should {
    """be implicitly converted into a Person with firstName "John" and lastName "" """ in {
      val John = "John"
      val person: Person = John
      person.firstName mustEqual John
      person.lastName mustEqual ""
    }
  }

// 1.11 ----------------------------------------------------------

  implicit def stringToPerson(name: String) = {
    require(name != null)
    name split " " toSeq match {
      case Seq(firstName, lastName) => Person(firstName, lastName)
      case _ => Person(name)
    }
  }

  """The string "John Doe" """ should {
    """be implicitly converted into a Person with firstName "John" and lastName "Doe" """ in {
      val John = "John"
      val Doe = "Doe"
      val person: Person = John + " " + Doe
      person.firstName mustEqual John
      person.lastName mustEqual Doe
    }
  }
