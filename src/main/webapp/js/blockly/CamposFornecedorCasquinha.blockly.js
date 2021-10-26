window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CamposFornecedorCasquinha = window.blockly.js.blockly.CamposFornecedorCasquinha || {};

/**
 * CamposFornecedorCasquinha
 */
window.blockly.js.blockly.CamposFornecedorCasquinha.CalculandoValorCasquinhaArgs = [];
window.blockly.js.blockly.CamposFornecedorCasquinha.CalculandoValorCasquinha = async function() {

  quantidade = this.cronapi.screen.getValueOfField("fornecedorcasquinha.active.quantidade");
  this.cronapi.screen.changeValueOfField("fornecedorcasquinha.active.valor", quantidade);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorCasquinha.DesabilitarCampoFornecedorCasquinhaArgs = [];
window.blockly.js.blockly.CamposFornecedorCasquinha.DesabilitarCampoFornecedorCasquinha = async function() {

  this.cronapi.screen.disableComponent("crn-textinput-valor-19632");
}
