window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CalcularValor = window.blockly.js.blockly.CalcularValor || {};

/**
 * CalcularValor
 */
window.blockly.js.blockly.CalcularValor.CalculandoValorCopinhoArgs = [];
window.blockly.js.blockly.CalcularValor.CalculandoValorCopinho = async function() {
 var tamanhoCopinho, quantidade, valorTotal;
  tamanhoCopinho = this.cronapi.screen.getValueOfField("fornecedorcopinho.active.tamanhocopo");
  quantidade = this.cronapi.screen.getValueOfField("fornecedorcopinho.active.quantidade");
  if (tamanhoCopinho == 'Copo 100 ml') {
    valorTotal = (quantidade * 5);
  } else {
    valorTotal = (quantidade * 10);
  }
  this.cronapi.screen.changeValueOfField("fornecedorcopinho.active.valor", valorTotal);
}
