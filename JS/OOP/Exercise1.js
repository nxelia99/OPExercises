
class Student {
    constructor(name, list){
      this.name = name
      this.list = ["Javascript", "HTML", "CSS"]
    }
    getData(){
        return console.log(this.name, this.list)
    }
  }

const student1 = new Student('Kai')
student1.getData()
