const list = [["yogurth", 3], ["bread", 2], ["milk", 6], ["apple",12], ["shampoo", 1]]
list.push(["Oil", 1]) // adds oil to the list
console.log(list)
list.pop() // deletes the last element of the list
console.log(list)

const films = [
    {title: "The Shawshank Redemption", director: "Frank Darabont", año: 1994 },
    {title: "The Dark Knight", director: "Christopher Nolan", año: 2008},
    {title: "Seven", director: "David Fincher", año: 1995}
]

const directors = films.map(film => {
    return film.director
}) //displays directors

const titles = films.map(film => {
    return film.title
}) //displays titles

const directors_titles_prop = directors.concat(titles) //displays directors and concatenates titles
console.log(directors_titles_prop)
const directors_titles = [...directors, ...titles]

console.log(titles)
console.log(directors_titles)