function slideShow(imgBox, travelDistance, imgBoxParent, timerCode, arrows, slider, currentActiveColor) {

    let newItemImgBox = imgBox.children[0].cloneNode(true);

    imgBox.appendChild(newItemImgBox);



    if (timerCode) {

        var isTimer = setInterval(autoplay, 3000);


        var aaa = 0;
        var bbb = 0;

        function autoplay() {

            aaa++;

            if (aaa > imgBox.children.length - 1) {
                imgBox.style.left = 0;

                aaa = 1;
            }

            animate(imgBox, -aaa * travelDistance);


        }
    }




    if (arrows) {
        arrows[0].onclick = function () {

            aaa--;


            animate(imgBox, -aaa * travelDistance)


            if (!slider) return


            bbb--;



            for (let i = 0; i < slider.children.length; i++) {
                slider.children[i].className = '';
            }


            slider.children[bbb].className = currentActiveColor;
        }


        arrows[1].onclick = function () {
            autoplay();
        }
    }


    function animate(el, target) {

        clearInterval(el.Timer);


        let ccc = target > el.offsetLeft ? 100 : -100;


        el.Timer = setInterval(function () {


            let value = target - el.offsetLeft;


            el.style.left = el.offsetLeft + ccc + 'px';


            if (Math.abs(value) < Math.abs(ccc)) {


                el.style.left = target + 'px';


                clearInterval(el.Timer);
            }
        }, 80)
    }
}
