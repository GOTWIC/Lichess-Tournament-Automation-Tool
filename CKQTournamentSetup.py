import berserk
import os
from dotenv import load_dotenv
from pprint import pprint
import datetime

load_dotenv()

session = berserk.TokenSession(os.getenv('lichessToken'))
client = berserk.Client(session=session)


pprint(client.tournaments.create(clock_time=10, clock_increment=5, minutes=70, name="Pawn 3 and Knight Arena", start_date='2022-02-24T23:30:00.000Z', rated=True, berserkable=False))



