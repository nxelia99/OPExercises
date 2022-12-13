// function for creating objects

const createPerson = (name, age, isDeveloper) => {
    return {
        name,
        age,
        isDeveloper,
        sayHi: function(){
            console.log('Hello')
        }
    }
}

const person1 = createPerson('Jojo', 25, false)
const person2 = createPerson('Kai', 23, true)
console.log(person1)
console.log(person2)

//using classes

class Person{ //creates an object type person
    name; //variables that are going to be used
    age;
    isDeveloper;
    constructor(name, age, isDeveloper){ //creates a class
        this.name = name
        this.age = age
        this.isDeveloper = isDeveloper
    }
    sayHi(){  //function of an object is called method
        console.log(`Hello my name is ${this.name} and I'm ${this.age} yo`)
    }
}

const newperson = new Person('Kai', 23, true)
console.log(newperson)
newperson.sayHi()

let person3 = new Person('Jojo', 25, false) //instance
console.log(person3 instanceof Person)
