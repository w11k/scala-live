/**
 * Copyright (c) 2010 WeigleWilczek.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

import org.specs.Specification

class PersonSpec extends Specification {

  "Creating a Person" should {
    "throw an IllegalArgumentException given a null firstName" in {
      new Person(null) must throwA[IllegalArgumentException]
    }
    "throw an IllegalArgumentException given a null lastName" in {
      new Person(lastName = null) must throwA[IllegalArgumentException]
    }
  }

  "Calling Person.toString" should {
    """return "John Doe" for firstName "John" and lastName "Doe" """ in {
      val John = "John"
      val Doe = "Doe"
      val person = new Person(John, Doe)
      person.toString mustEqual John + " " + Doe
    }
  }

  """The string "John" """ should {
    """be implicitly converted into a Person with firstName "John" and lastName "" """ in {
      val John = "John"
      val person: Person = John
      person.firstName mustEqual John
      person.lastName mustEqual ""
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
}
