const array = [1,2,3,4,5,1,2,5,6, "hola"] //si almacena elementos no unicos.
const set = new Set(array) //conjunto ordenado de valores/elementos unicos.

console.log(array)
console.log(set)

set.add(9)
console.log(set)

//delete
set.delete("hola")
console.log(set)

//clear:

// set.clear()
// console.log(set)

// .has()
console.log(set.has(56))
console.log(array.includes(3))

// .size()

console.log(set.size)

// iteracion .forEach()
set.forEach(valor => {
    console.log(valor)
})

// iteracion 2 
const it_set = set.values()
console.log(it_set)
const ar_set = [... set]
console.log(ar_set[1])