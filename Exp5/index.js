function validate() {

    if (isempty("username") && isempty("userpass") && isempty("usermail") && isempty("userphno") && radio()) {
        //         <div>
        //         <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
        //           Launch static backdrop modal
        //         </button>


        //         <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
        //           <div class="modal-dialog">
        //             <div class="modal-content">
        //               <div class="modal-header">
        //                 <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
        //                 <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        //               </div>
        //               <div class="modal-body">
        //                 ...
        //               </div>
        //               <div class="modal-footer">
        //                 <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        //                 <button type="button" class="btn btn-primary">Understood</button>
        //               </div>
        //             </div>
        //           </div>
        //         </div>
        //         </div>
        if (/^[a-zA-Z]+$/.test(document.getElementById("username").value)) {
            if (/[0-9]{10}$/.test(document.getElementById("userphno").value)) {
                if(/[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]{2,3}/.test(document.getElementById("usermail"))){

                }
                else{
                    //else block of email
                }
            }
            else {
                //else block of phone number
            }
        }
        else {
            //else block of name
        }
    }
}

function isempty(id) {
    const ele = document.getElementById(id).value;
    if (ele == null || ele == "") {
        return false;
    }
    else {
        return true;
    }
}

// function validateradio(){
//     const radioButtons=document.querySelectorAll('input[name="flexRadioDefault"]');
//     for (const radioButton of radioButtons) {
//         if (radioButton.checked) {
//             const test = radioButton.value;
//             break;
//         }
//         if(test){
//             alert("checked");
//         }
//     }
// }
function radio() {
    if (document.getElementById("usergen1").checked || document.getElementById("usergen2").checked) {
        return true;
    }
    else {
        return false;
    }
}

