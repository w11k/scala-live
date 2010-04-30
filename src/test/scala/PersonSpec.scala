/**
 * Copyright (c) 2010 WeigleWilczek.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

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
