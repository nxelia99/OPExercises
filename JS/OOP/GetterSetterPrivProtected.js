class Person {
    constructor(name, age){
      this.name = name
      this.age = age
    }
  }
  
  const person1 = new Person('Kai', 23)
  person1.name = 'Jojos'
  console.log(person1.name) // I can change the value
  
  // Protected attributes and methods:
  
  class Dog {
    #name // it makes the attribute private, can't be changed nor 
          //be accessed from the outside (but it can from inherited 
          //classes)
    #age
  
    //Protected (can't be accessed from the outside)
    _isNervous = true
    
    constructor(name, age){  
      this.#name = name
      this.#age = age
    }
    getName(){ //getter method
        return this.#name
    }
    getAge(){
        return this.#age
    }
    setAge(newage){ //setter method
        this.#age = newage
    }
  }
  
  const dog1 = new Dog('Firulais', 2)
  dog1.name = 'Jojos'
  console.log(dog1.getName(), dog1.getAge())
  console.log(dog1._isNervous)
  dog1.setAge(3)
  console.log(dog1.getAge())
