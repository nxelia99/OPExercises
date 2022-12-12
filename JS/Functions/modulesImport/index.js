import { factorial, multiply, name } from "./modules/math.js";
import getAuthor, {bookCervantes} from "./modules/literature.js";
const fact1 = factorial(3)
console.log(fact1)

const multiply3 = multiply(3,6)
console.log(multiply3)
console.log(name)

console.log(getAuthor() + "didn't write " + bookCervantes)