import {add, multiply} from './modules/controller.js'
import chalk from 'chalk';

const add1 = add(1, 2)
const multiply4 = multiply(4, 5)

console.log(chalk.green(add1))
console.log(chalk.green(multiply4))
