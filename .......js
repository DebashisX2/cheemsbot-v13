 const msg = baileys.generateWAMessageFromContent(m.chat, {
        viewOnceMessage: {
            message: {
                messageContextInfo: {
                    deviceListMetadata: {},
                    deviceListMetadataVersion: 2
                },
                interactiveMessage: proto.Message.InteractiveMessage.fromObject({
                    body: proto.Message.InteractiveMessage.Body.fromObject({
                        text: "IkyyBotz - Menu"
                    }),
                    footer: proto.Message.InteractiveMessage.Footer.fromObject({
                        text: "\nHi 👋, I am a WhatsApp MultiDevice Bot that will help with daily activities via WhatsApp.\n You can use me to download videos, listen to songs, create stickers, etc."
                    }),
                    header: proto.Message.InteractiveMessage.Header.fromObject({
                        title: "IkyyBotz",
                        subtitle: "Menu Ikyy-Botz",
                        hasMediaAttachment: false
                    }),
                    carouselMessage: proto.Message.InteractiveMessage.CarouselMessage.fromObject({
                        cards: [
                            {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "controlpanel"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Control Panel`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menupanel"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Panel`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                            {
                                body: proto.Message.InteractiveMessage.Body.fromObject({
                                    text: `By AraBotz`
                                }),
                                footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                    text: "menuowner"
                                }),
                                header: proto.Message.InteractiveMessage.Header.fromObject({
                                    title: `Menu Owner`,
                                    hasMediaAttachment: true,
                                    imageMessage: image2
                                }),
                                nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                    buttons: [
                                        {
                                            name: "quick_reply",
                                            buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                        },
                                        {
                                            name: "quick_reply",
                                            buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                        },
                                        {
                                            name: "quick_reply",
                                            buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                        }
                                    ]
                                })
                            },
                            {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menushop"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Shop`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          {
                            body: proto.Message.InteractiveMessage.Body.fromObject({
                                text: `By AraBotz`
                            }),
                            footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                text: "menugrup"
                            }),
                            header: proto.Message.InteractiveMessage.Header.fromObject({
                                title: `Menu Group`,
                                hasMediaAttachment: true,
                                imageMessage: image4
                            }),
                            nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                buttons: [
                                    {
                                        name: "quick_reply",
                                        buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                    },
                                    {
                                        name: "quick_reply",
                                        buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                    },
                                    {
                                        name: "quick_reply",
                                        buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                    }
                                ]
                            })
                        },
                        {
                          body: proto.Message.InteractiveMessage.Body.fromObject({
                              text: `By AraBotz`
                          }),
                          footer: proto.Message.InteractiveMessage.Footer.fromObject({
                              text: "menustorage"
                          }),
                          header: proto.Message.InteractiveMessage.Header.fromObject({
                              title: `Menu Storage`,
                              hasMediaAttachment: true,
                              imageMessage: image5
                          }),
                          nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                              buttons: [
                                  {
                                      name: "quick_reply",
                                      buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                  },
                                  {
                                      name: "quick_reply",
                                      buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                  },
                                  {
                                      name: "quick_reply",
                                      buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                  }
                              ]
                          })
                      },
                      {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menutools"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Tools`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menudownload"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Download`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menuconvert"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Convert`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menusticker"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Sticker`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          },
                          
                          {
                              body: proto.Message.InteractiveMessage.Body.fromObject({
                                  text: `By AraBotz`
                              }),
                              footer: proto.Message.InteractiveMessage.Footer.fromObject({
                                  text: "menuother"
                              }),
                              header: proto.Message.InteractiveMessage.Header.fromObject({
                                  title: `Menu Other`,
                                  hasMediaAttachment: true,
                                  imageMessage: image3
                              }),
                              nativeFlowMessage: proto.Message.InteractiveMessage.NativeFlowMessage.fromObject({
                                  buttons: [
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Owner\",\"id\":\".owner\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Ping\",\"id\":\".ping\"}"
                                      },
                                      {
                                          name: "quick_reply",
                                          buttonParamsJson: "{\"display_text\":\"Tqto\",\"id\":\".tqto\"}"
                                      }
                                  ]
                              })
                          }
                        ]
                    })
                })
            }
        }
    }, {});

    await ehz.relayMessage(msg.key.remoteJid, msg.message, {
        messageId: msg.key.id
    });

