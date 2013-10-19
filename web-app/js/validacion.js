// JavaScript Document // JAVASCRIPT PARA CARPOOLING
function validar(formulario)
{

//valida nombre
  if (formulario.nombre.value=='') 
  {
    alert('Ingrese su nombre.');
    formulario.nombre.focus();
    return (false);
  }
  var letrasok = 'ABCDEFGHIJKLMN�OPQRSTUVWXYZ�����' + 'abcdefghijklmn�opqrstuvwxyz�����';
  var letras = formulario.nombre.value;
  var validado = true; 
  for (i = 0; i < letras.length; i++) 
  {
    ch = letras.charAt(i); //charAt devuelve un valor de car�cter igual al car�cter situado en la posici�n especificada por index. 
    for (j = 0; j < letrasok.length; j++)
      if (ch == letrasok.charAt(j))
        break;
    if (j == letrasok.length) 
	{ 
      validado= false; 
      break; 
    }
  }
  if (!validado) 
  { 
    alert('Escriba s�lo letras'); 
    formulario.nombre.focus(); 
    return (false); 
  } 

//valida apellido
if(formulario.apellido.value == '')
{
    alert('Ingrese su apellido');
    formulario.apellido.focus();
    return false;
}
var letrasok = 'ABCDEFGHIJKLMN�OPQRSTUVWXYZ�����' + 'abcdefghijklmn�opqrstuvwxyz�����';
  var letras = formulario.apellido.value;
  var validado= true; 
  for (i = 0; i < letras.length; i++) 
  {
    ch = letras.charAt(i); 
    for (j = 0; j < letrasok.length; j++)
      if (ch == letrasok.charAt(j))
        break;
    if (j == letrasok.length) 
	{ 
      validado = false; 
      break; 
    }
  }
  if (!validado) { 
    alert('Escriba s�lo letras,por favor'); 
    formulario.apellido.focus(); 
    return (false); 
  } 
  
valor = document.getElementById("dni").value;
if( !(/^\d{8}$/.test(valor)) ) {
	alert('Ingrese su dni correctamente y sin espacios');
  return false;
}

//valida direccion de mail
if(formulario.email.value.indexOf('@')==-1) 
{
	alert('Debe ingresar su correo electronico.');
	formulario.email.focus();
	return false;
}
if(formulario.email.value.indexOf('.')==-1)
{
	alert('Debe ingresar su correo electr�nico correctamente.');
	formulario.email.focus();
	return false;
}	
//valida telefono
  valor = document.getElementById("telefono").value;
if( !(/^\d{8}$/.test(valor)) ) {
	alert('Ingrese su numero telefonico particular');
  return false;
}
 //valida contrase�a
if(formulario.contrase�a.value==''){
alert('Ingrese su contrase�a');
formulario.contrase�a.focus();
return false;
}
//Valida repetir contrase�a
if(formulario.repetircontrase�a.value==''){
alert('Ingrese nuevamente su contrase�a');
formulario.repetircontrase�a.focus();
return false;
}
//valida que las contrase�as sean iguales
if(formulario.contrase�a.value!=formulario.repetircontrase�a.value){
alert('Las contrase�as deben coincidir');
return false;
}



//valida que acepte los terminos
elemento = document.getElementById("terminos");
if( !elemento.checked ) {
	alert('Debe aceptar los terminos y condiciones para continuar');
  return false;
}

//validacion de envio
alert('Gracias por completar el formulario.');
return true;	
}