let i = 0;

while (i < 10) {
    i++;
    if (i === 5) {
        continue;
    }
    if (i === 8) {
        break;
    }
    console.log(i);
}
