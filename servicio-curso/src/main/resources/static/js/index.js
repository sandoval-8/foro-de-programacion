/**
 * 
 */
function ellipsis_box(elemento, max_chars) {
	limite_text = $(elemento).text();
	if (limite_text.length > max_chars) {
		limite = limite_text.substr(0, max_chars) + " ...";
		$(elemento).text(limite);
	}
}
function ordenar_celdas(elemento){
	
	console.log(elemento);
}
$(function() {
	ellipsis_box("p", 200);
	ordenar_celdas("celda");		
});