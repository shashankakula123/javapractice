$(document).ready(function(){
 
   $(".Modern-Slider").slick({
    autoplay:true,
    autoplaySpeed:8000,
    speed:600,
    slidesToShow:1,
    slidesToScroll:1,
    pauseOnHover:false,
    dots:true,
    pauseOnDotsHover:false,
    cssEase:'linear',
   // fade:true,
    draggable:false,
   arrow:true,
       prevArrow:'<button class="PrevArrow"></button>',
    nextArrow:'<button class="NextArrow"></button>',
  }); 
  
  
  
    document.getElementById("mybtn").addEventListener("click",function(){
      var x = document.getElementById("myform");
      if (x.style.display === "none") {
        x.style.display = "block";
      } else {
        x.style.display = "none";
      }
    })
  


   
      
        $("#sendMessage").click(function(){
          console.log("hdhdhdhd");
                 
                  $("#myform").hide();
              });
  
  
     
     var message  ;
  
  $("#sendMessage").on("click", function() {
      message = $("#contactform").serialize();
      $.ajax({
        url: "https://formspree.io/f/mzbkaygk", 
          method: "POST",
          data: {message: message},
          dataType: "json"
      });
      alert('Thanks for the email, we\'ll be in touch promptly.');
      return false;
  });
  
  
  
  
  
  
  
  
  
  
      
      function createHomePageProductCard(obj) {
       
    
        var mainDiv = document.createElement('div');
        mainDiv.classList.add('product-card');
    
        var productLink = document.createElement('a');
        productLink.href = 'productdetailspage.html?='+obj.id;
    
        var productImage = document.createElement('img');
        productImage.classList.add('product-image');
        productImage.src = obj.preview;
        productImage.alt = obj.name + ' Pic';
    
        productLink.appendChild(productImage);
    
        var innerDiv = document.createElement('div');
        innerDiv.classList.add('product-meta');
    
        var productName = document.createElement('h4');
        var productNameText = document.createTextNode(obj.name);
        productName.appendChild(productNameText);
    
        var productBrand = document.createElement('h5');
        var productBrandText = document.createTextNode(obj.brand);
        productBrand.appendChild(productBrandText);
    
        var productPrice = document.createElement('p');
        var productPriceText = document.createTextNode('Rs ' + obj.price);
        productPrice.appendChild(productPriceText);
    
        innerDiv.appendChild(productName);
        innerDiv.appendChild(productBrand);
        innerDiv.appendChild(productPrice);
    
        mainDiv.appendChild(productLink);
        mainDiv.appendChild(innerDiv);
    
        return mainDiv;
      }
    
      $.get('https://5d76bf96515d1a0014085cf9.mockapi.io/product', function(data, status) {
        var response = data;
    
        for(var i=0; i<response.length; i++) {
          if(response[i].isAccessory) {
            $('#accessory-grid').append(createHomePageProductCard(response[i]))
          } else {
            $('#clothing-grid').append(createHomePageProductCard(response[i]))
          }
        }
      });
   });
