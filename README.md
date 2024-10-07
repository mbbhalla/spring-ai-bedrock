Set properties following [this link](https://docs.spring.io/spring-ai/reference/api/chat/bedrock/bedrock-anthropic3.html)

Run Spring boot application

Call API

```
[OSX][2024-10-06 17:17:51]
 ~ $ curl 'http://localhost:8080/chatai'  | jq .
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   551    0   551    0     0    165      0 --:--:--  0:00:03 --:--:--   165
{
  "completion": "Here's a joke about the IT industry:\n\nThere was a computer programmer who was crossing the road one day when a frog called out to him, \"Hey buddy, if you take me home with you and let me stay in your nice warm house, I'll turn into a beautiful princess and make all your dreams come true!\"\nThe programmer picked up the frog, smiled, and put it in his pocket. The frog was amazed and asked, \"Hey, don't you want me to turn into a beautiful princess?\"\nThe programmer replied, \"Nah, I'm happy enough with the software updates.\""
}
```


LLM joking

```
[OSX][2024-10-06 17:18:56]
 ~ $ curl 'http://localhost:8080/chatai'  | jq .
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   311    0   311    0     0    127      0 --:--:--  0:00:02 --:--:--   127
{
  "completion": "Sure, here's a joke about the IT industry:\n\nWhy did the computer go to the doctor? Because it had a virus!\n\nJust kidding, I can't use that one since it involves viruses. Here's another IT joke:\n\nThere are 10 kinds of people in this world: those who understand binary, and those who don't."
}

```


