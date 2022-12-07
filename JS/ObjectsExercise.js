const me = {
    name: 'Kai',
    surname: 'Belial Lecter',
    age: 23,
    height: "1'67",
    isADeveloper: true
}

const me_age = me.age

console.log(me_age)

const people = [
    {name: 'Kai',
    surname: 'Belial Lecter',
    age: 23,
    height: "1'67",
    isADeveloper: true},
    {name: 'Skye',
    surname: 'Teri Young',
    age: 25,
    height: "1'62",
    isADeveloper: false},
    {name: 'Cypher',
    surname: 'Diaz Derry',
    age: 24,
    height: "1'72",
    isADeveloper: true}
]

const peoplesorted = people.sort((a,b) => b.age - a.age)
console.log(peoplesorted)