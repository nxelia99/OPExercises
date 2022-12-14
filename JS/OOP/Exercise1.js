//declare the class

class Student {
    constructor(name, list){
      this.name = name
      this.list = ["Javascript", "HTML", "CSS"]
    }
    getData(){
        return {name: this.name, lessons: this.list}
    }
  }

const student1 = new Student('Kai')
console.log(student1.getData())
