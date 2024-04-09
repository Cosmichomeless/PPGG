const screen = window.screen;
document.write("Width: " + screen.width + "<br>");
document.write("Height: " + screen.height + "<br>");

const screenLeft = window.screenLeft;
const screenRight = window.screenRight;
document.write("Screen Left: " + screenLeft + "<br>");
document.write("Screen Right: " + screenRight + "<br>");

const scrollX = window.scrollX;
const scrollY = window.scrollY;
document.write("Scroll X: " + scrollX + "<br>");
document.write("Scroll Y: " + scrollY + "<br>");

const resize = window.resizeTo(800, 600);
document.write("Resize: " + resize + "<br>");
const moveTo = window.moveTo(100, 100);

const moveby = window.moveBy(100, 100);
document.write("Move By: " + moveby + "<br>");
const moveto = window.moveTo(100, 100);
document.write("Move To: " + moveto + "<br>");
