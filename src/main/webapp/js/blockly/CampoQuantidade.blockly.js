window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CampoQuantidade = window.blockly.js.blockly.CampoQuantidade || {};

/**
 * CampoQuantidade
 */
window.blockly.js.blockly.CampoQuantidade.DesabilitarCampoArgs = [];
window.blockly.js.blockly.CampoQuantidade.DesabilitarCampo = async function() {

  if (this.cronapi.screen.isInsertingMode("fornecedorcopinho")) {
    this.cronapi.screen.disableComponent("crn-textinput-quantidade-55495");
    this.cronapi.screen.disableComponent("crn-textinput-valor-55495");
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CampoQuantidade.MostrarCampoQuantidadeArgs = [];
window.blockly.js.blockly.CampoQuantidade.MostrarCampoQuantidade = async function() {

  this.cronapi.screen.enableComponent("crn-textinput-quantidade-55495");
}
