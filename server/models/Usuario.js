//Ingenieria de software
//Juan Carlos Tapia 14133
//Rodrigo Castro 14092
//Leonel Guillen 14451
//Hugo Noriega 14097

var mongoose = require('mongoose');

// Create the MovieSchema.
var UsuarioSchema = new mongoose.Schema({
  id: {
    type: String,
    required: true
  },
  nombre: {
    type: String,
    required: true
  },
  
  contrasena: {
    type: String,
    required: true
  },
  
  telefono: {
    type: String,
    required: true
  },
  
  correo: {
    type: String,
    required: true
  }
});

// Export the model.
module.exports = mongoose.model('usuario', UsuarioSchema);
