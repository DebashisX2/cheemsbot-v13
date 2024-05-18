//base by DGXeon
//re-upload? recode? copy code? give credit ya :)
//YouTube: @DGXeon
//Instagram: unicorn_xeon13
//Telegram: t.me/xeonbotinc
//GitHub: @DGXeon
//WhatsApp: +919339619072
//want more free bot scripts? subscribe to my youtube channel: https://youtube.com/@DGXeon

const fs = require('fs')
const chalk = require('chalk')

//session
global.sessionid ='ur session id'

//owmner v card
global.ytname = "RICK SUNDAR SARKAR" //ur yt chanel name
global.socialm = "" //ur github or insta name
global.location = "" //ur location

//new
global.botname = 'A S T R O N A U T  B O T' //ur bot name
global.ownernumber = '918327526811' //ur owner number
global.ownername = '𝑺𝒍𝒆𝒆𝒑𝒊𝒏𝒈...' //ur owner name
global.websitex = "https://www.facebook.com/LeonardorickCaprio"
global.wagc = "https://wa.me/918327526811"
global.themeemoji = '📌🤩'
global.wm = "A S T R O N A U T  B O T "
global.botscript = 'https://github.com/Debashis121212/CheemsBot-MD11' //script link
global.packname = "Sticker By"
global.author = "𝑺𝒍𝒆𝒆𝒑𝒊𝒏𝒈..."
global.creator = "918327526811@s.whatsapp.net"
global.xprefix = '.'
global.premium = ["918327526811"] // Premium User
global.hituet = 0

//bot sett
global.typemenu = 'v2' // menu type 'v1' => 'v8'
global.typereply = 'v2' // reply type 'v1' => 'v3'
global.autoblocknumber = '92' //set autoblock country code
global.antiforeignnumber = '91' //set anti foreign number country code
global.welcome = true //welcome/left in groups
global.anticall = false //bot blocks user when called
global.autoswview = true //auto status/story view
global.adminevent = true //show promote/demote message
global.groupevent = true //show update messages in group chat
//msg
global.mess = {
	limit: 'Your limit is up!',
	nsfw: "গ্রুপে মেয়ে আছে, So don't do this type-এর কুটকুটি",
    done: 'Done✓',
    error: 'Ah Fuck, Theres an error in system!',
    success: 'Here you go! 🥳'
}
//thumbnail
global.thumb = fs.readFileSync('./XeonMedia/theme/cheemspic.jpg')

let file = require.resolve(__filename)
fs.watchFile(file, () => {
    fs.unwatchFile(file)
    console.log(chalk.redBright(`Update'${__filename}'`))
    delete require.cache[file]
    require(file)
})
