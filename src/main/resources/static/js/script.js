function firstToSecond() {
    var base = document.getElementById("base");
    var sbase = document.getElementById("sbase");
    var srate = document.getElementById("srate");
    rate.value = Number(Math.round(srate.value / sbase.value * base.value + 'e2') + 'e-2');
}
function secondToFirst() {
    var sbase = document.getElementById("sbase");
    var rate = document.getElementById("rate");
    var srate = document.getElementById("srate");
    base.value = Number(Math.round(sbase.value / srate.value * rate.value + 'e2') + 'e-2');
}
