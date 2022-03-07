# Lichess Tournament Automation Tool
A java automation tool that remotely sets up chess tournaments via Lichess API

### Usage

Generate a OAuth API Token here: [Lichess API Access Token Request](https://lichess.org/account/oauth/token/create "New Personal Lichess API Access Token")

Download the repo

Paste the token inside of the '' in the .env file

Run TournamentSetup.java

This tool was originaly written in python. However, the python client for the LichessAPI was missing a geat deal of documentation rendering the tool incomplete. The Java client has significantly better documentation, allowing this tool to be completed.
