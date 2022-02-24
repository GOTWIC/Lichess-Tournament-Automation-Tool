import berserk
import os
from dotenv import load_dotenv

load_dotenv()

session = berserk.TokenSession(os.getenv('lichessToken'))
client = berserk.Client(session=session)

print(client.account.get())

