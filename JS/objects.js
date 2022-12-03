//crear un objeto a partir de otro modifica en ambos.
const obj2 = obj
console.log(obj2)

obj2.name = 'Carlos'
console.log(obj.name)

// otra forma de crear objeto que permite modificar solo un objeto.

const obj3 = { ... obj}
obj3.name = "Silvia"
console.log(obj3.name)

// lista objetos.

const filmslist = [
    {title: 'Lo que el viento se llevó', year: 1939},
    {title: 'Titanic', year: 1997},
    {title: 'Moana', year: 2016},
    {title: 'The Silence of the lambs', year: 1991}
    
]

//ordenar por año

filmslist.sort((a, b) => a.year - b.year)
console.log(filmslist)