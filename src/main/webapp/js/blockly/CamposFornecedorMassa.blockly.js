window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CamposFornecedorMassa = window.blockly.js.blockly.CamposFornecedorMassa || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorMassa.DesabilitarCampoFornecedorMassaArgs = [];
window.blockly.js.blockly.CamposFornecedorMassa.DesabilitarCampoFornecedorMassa = async function() {
 var saborSorvete, quantidade, valorSorvete, valorTotal;
  if (this.cronapi.screen.isInsertingMode("fornecedormassa")) {
    this.cronapi.screen.disableComponent("crn-textinput-quantidade-86644");
    this.cronapi.screen.disableComponent("crn-textinput-valor-86644");
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorMassa.CalculandoValorMassaArgs = [];
window.blockly.js.blockly.CamposFornecedorMassa.CalculandoValorMassa = async function() {
 var saborSorvete, quantidade, valorSorvete, valorTotal;
  saborSorvete = this.cronapi.screen.getValueOfField("fornecedormassa.active.sorvete");
  quantidade = this.cronapi.screen.getValueOfField("fornecedormassa.active.quantidade");
  valorSorvete = await this.cronapi.util.callServerBlockly('blockly.CampoFornecedorMassa:ObterValorDoSorvete', saborSorvete);
  valorTotal = (quantidade * valorSorvete);
  this.cronapi.screen.changeValueOfField("fornecedormassa.active.valor", valorTotal);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.CamposFornecedorMassa.MostrarCampoFornecedorMassaArgs = [];
window.blockly.js.blockly.CamposFornecedorMassa.MostrarCampoFornecedorMassa = async function() {
 var saborSorvete, quantidade, valorSorvete, valorTotal;
  this.cronapi.screen.enableComponent("crn-textinput-quantidade-86644");
}
