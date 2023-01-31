const mongoose = require('mongoose');

const entrySchema = mongoose.Schema({
    date: String,
    entry: String
});

module.exports = mongoose.model('DiaryEntry', entrySchema);