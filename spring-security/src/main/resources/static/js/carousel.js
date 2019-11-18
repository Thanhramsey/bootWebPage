///load image

$(document).ready(function () {

    var elmnt = document.getElementById("noteRegister");
    if(elmnt.textContent != null){
        $(function() {
            $(window).scrollTop($('#registerForm').offset().top);
        });
    }
});

$(function(){

    var timer;
    var delay = 300;
    $('#img1').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img1').attr("src","../images/clothes/áo/white/basic.jpg");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img1').attr("src","../images/clothes/áo/black/basic.jpg");
        clearTimeout(timer);
    });
    $('#img2').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img2').attr("src","../images/clothes/áo/white/chaien.png");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img2').attr("src","../images/clothes/áo/black/chaien.png");
        clearTimeout(timer);
    });
    $('#img3').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img3').attr("src","../images/clothes/áo/white/goku_master.jpg");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img3').attr("src","../images/clothes/áo/black/doraemon.webp");
        clearTimeout(timer);
    });
    $('#img4').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img4').attr("src","../images/clothes/áo/white/goku_master.jpg");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img4').attr("src","../images/clothes/áo/black/goku.jpg");
        clearTimeout(timer);
    });
    $('#img5').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img5').attr("src","../images/clothes/áo/white/harrypotter.webp");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img5').attr("src","../images/clothes/áo/black/harry_potter.png");
        clearTimeout(timer);
    });
    $('#img6').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img6').attr("src","../images/clothes/áo/white/kakashi.webp");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img6').attr("src","../images/clothes/áo/black/kakashi.jpg");
        clearTimeout(timer);
    });
    $('#img7').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img7').attr("src","../images/clothes/áo/white/naruto.webp");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img7').attr("src","../images/clothes/áo/black/naruto.webp");
        clearTimeout(timer);
    });
    $('#img8').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img8').attr("src","../images/clothes/áo/white/luffy.png");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img8').attr("src","../images/clothes/áo/black/luffy.webp");
        clearTimeout(timer);
    });
    $('#img9').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img9').attr("src","../images/clothes/áo/white/pain.webp");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img9').attr("src","../images/clothes/áo/black/pain.jpg");
        clearTimeout(timer);
    });
    $('#img10').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img10').attr("src","../images/clothes/áo/white/sasuke.png");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img10').attr("src","../images/clothes/áo/black/sasuke.png");
        clearTimeout(timer);
    });
    $('#img11').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img11').attr("src","../images/clothes/áo/white/thanos.png");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img11').attr("src","../images/clothes/áo/black/thanos.png");
        clearTimeout(timer);
    });
    $('#img12').hover(function() {
        // on mouse in, start a timeout
        timer = setTimeout(function() {
            $('#img12').attr("src","../images/clothes/áo/white/banhmi.jpg");
        }, delay);
    }, function() {
        // on mouse out, cancel the timer
        $('#img12').attr("src","../images/clothes/áo/black/yugi.webp");
        clearTimeout(timer);
    });
});

