var rows = 5;
var columns = 5;

var currTile;
var otherTile;

var turns = 0;

window.onload = function(){
  //initialize the 5x5 board
  for (let r = 0; r < rows; r++){
      for (let c = 0; c < columns; c++){
          // creates <img> tag
          let tile = document.createElement("img");
          tile.src = './images/blank.jpg';

          //Drag functionality
          tile.addEventListener("dragstart", dragStart) //clicking on img to drag
          tile.addEventListener("dragover", dragOver) //drag on image
          tile.addEventListener("dragenter", dragEnter) //dragging an img into another one
          tile.addEventListener("dragleave", dragLeave) // dragging an img away from another one
          tile.addEventListener("drop", dragDrop) //drop an img onto another one
          tile.addEventListener("dragend", dragEnd) //after dragDrop is completed  

          document.getElementById("board").append(tile) //ads the tile to board
      }
  }

    // pieces

  let pieces = []
  for(let i=1; i <=rows*columns; i++){
      pieces.push(i.toString()); // puts '1' to '25' into the array (puzzle images names)
  }
  pieces.reverse() //shuffles the pieces
  for (let i=0; i < pieces.length; i++){
      let j = Math.floor(Math.random() * pieces.length)

      //generates random pieces order everytime we refresh
      let tmp = pieces[i];
      pieces[i] = pieces[j];
      pieces[j] = tmp
  }

  for (let i=0; i < pieces.length; i++){
      let tile = document.createElement("img")
      tile.src = "./images/" + pieces[i] + ".jpg"

      //Drag functionality
      tile.addEventListener("dragstart", dragStart) //clicking on img to drag
      tile.addEventListener("dragover", dragOver) //drag on image
      tile.addEventListener("dragenter", dragEnter) //dragging an img into another one
      tile.addEventListener("dragleave", dragLeave) // dragging an img away from another one
      tile.addEventListener("drop", dragDrop) //drop an img onto another one
      tile.addEventListener("dragend", dragEnd) //after dragDrop is completed  
      
      document.getElementById("pieces").append(tile)
  }
}

//Drag tiles

function dragStart(){
  currTile = this; //this refers to img that was clicked on for dragging
}


function dragOver(e){
  e.preventDefault();
}

function dragEnter(e){
  e.preventDefault();
}
function dragLeave(){

}

function dragDrop(){
  otherTile = this; // this refers to img that is being dropped on
}

function dragEnd(){
  if (currTile.src.includes("blank")){
    return;
  }
  let currImg = currTile.src;
  let otherImg = otherTile.src;
  currTile.src = otherImg;
  otherTile.src = currImg;

  turns += 1;
  document.getElementById("turns").innerText = turns
}
