window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CamposFornecedorCopinho = window.blockly.js.blockly.CamposFornecedorCopinho || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorCopinho.MostrarCampoFornecedorCopinhoArgs = [];
window.blockly.js.blockly.CamposFornecedorCopinho.MostrarCampoFornecedorCopinho = async function() {
 var item, quantidade, tamanhoCopinho, valorTotal;
  this.cronapi.screen.enableComponent("crn-textinput-quantidade-55495");
}

/**
 * CampoQuantidade
 */
window.blockly.js.blockly.CamposFornecedorCopinho.DesabilitarCampoFornecedorCopinhoArgs = [];
window.blockly.js.blockly.CamposFornecedorCopinho.DesabilitarCampoFornecedorCopinho = async function() {
 var item, quantidade, tamanhoCopinho, valorTotal;
  if (this.cronapi.screen.isInsertingMode("fornecedorcopinho")) {
    this.cronapi.screen.disableComponent("crn-textinput-quantidade-55495");
    this.cronapi.screen.disableComponent("crn-textinput-valor-55495");
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorCopinho.CalculandoValorCopinhoArgs = [];
window.blockly.js.blockly.CamposFornecedorCopinho.CalculandoValorCopinho = async function() {
 var item, quantidade, tamanhoCopinho, valorTotal;
  tamanhoCopinho = this.cronapi.screen.getValueOfField("fornecedorcopinho.active.tamanhocopo");
  quantidade = this.cronapi.screen.getValueOfField("fornecedorcopinho.active.quantidade");
  if (tamanhoCopinho == 'Copo 100 ml') {
    valorTotal = (quantidade * 5);
  } else {
    valorTotal = (quantidade * 10);
  }
  this.cronapi.screen.changeValueOfField("fornecedorcopinho.active.valor", valorTotal);
}
