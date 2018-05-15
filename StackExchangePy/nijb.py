import csv
import requests
import os
import datetime

outfile = open("NHL_Indiv_TEAM.csv","w",newline='')
writer = csv.writer(outfile)
header=[
    "TmAbr","Team","Opp","GameLocation","GameId",
    "Date","GP","GF","SF","S%","GA","SA","SV%","W","L","OTL",
    "SoGW","SoGL","PPopp","PPGF","PPPctg","PK",
    "PPGA","PKpctg","TeamPoints","FOW","FOL","FO%","TeamId",

    "BS","GiveA's","TakeA's","HitsFor",

    "Rest",

    "ENgoals","EVgoals","OTgoals","PPgoals","SHgoals",

    "shotAA","shotAAhead","shotAttemptsBehind","shotAttemptsClose","shotAttemptsFor","shotAttemptsTied",
    "unblockedShotAttempts","unblockedShotAttemptsAgainst","unblockedShotAttemptsAhead","unblockedShotAttemptsBehind",
    "unblockedShotAttemptsClose","unblockedShotAttemptsFor","unblockedShotAttemptsTied"]

writer.writerow(header)

req = requests.get('http://www.nhl.com/stats/rest/team?isAggregate=false&reportType=basic&isGame=true&reportName=teamsummary&sort=[{%22property%22:%22teamAbbrev%22,%22direction%22:%22ASC%22},{%22property%22:%22gameDate%22,%22direction%22:%22ASC%22}]&cayenneExp=gameDate%3E=%222016-10-12%22%20and%20gameDate%3C=%222017-04-09%22%20and%20gameTypeId=2') 
data = req.json()['data']

req2 = requests.get('http://www.nhl.com/stats/rest/team?isAggregate=false&reportType=basic&isGame=true&reportName=realtime&sort=[{%22property%22:%22teamAbbrev%22,%22direction%22:%22ASC%22},{%22property%22:%22gameDate%22,%22direction%22:%22ASC%22}]&cayenneExp=gameDate%3E=%222016-10-12%22%20and%20gameDate%3C=%222017-04-09%22%20and%20gameTypeId=2') 
data2 = req2.json()['data']

req3 = requests.get('http://www.nhl.com/stats/rest/team?isAggregate=false&reportType=basic&isGame=true&reportName=teamdaysbetweengames&sort=[{%22property%22:%22teamAbbrev%22,%22direction%22:%22ASC%22},{%22property%22:%22gameDate%22,%22direction%22:%22ASC%22}]&cayenneExp=gameDate%3E=%222016-10-12%22%20and%20gameDate%3C=%222017-04-09%22%20and%20gameTypeId=2') 
data3 = req3.json()['data']

req4 = requests.get('http://www.nhl.com/stats/rest/team?isAggregate=false&reportType=basic&isGame=true&reportName=teamgoalsbytype&sort=[{%22property%22:%22teamAbbrev%22,%22direction%22:%22ASC%22},{%22property%22:%22gameDate%22,%22direction%22:%22ASC%22}]&cayenneExp=gameDate%3E=%222016-10-12%22%20and%20gameDate%3C=%222017-04-09%22%20and%20gameTypeId=2') 
data4 = req4.json()['data']

req5 = requests.get('http://www.nhl.com/stats/rest/team?isAggregate=false&reportType=shooting&isGame=true&reportName=teamsummaryshooting&sort=[{%22property%22:%22teamAbbrev%22,%22direction%22:%22ASC%22},{%22property%22:%22gameDate%22,%22direction%22:%22ASC%22}]&cayenneExp=gameDate%3E=%222016-10-12%22%20and%20gameDate%3C=%222017-04-09%22%20and%20gameTypeId=2')
data5 = req5.json()['data']

def save_ratio(shotsAgainst, goalsAgainst):
    try:
        return shotsAgainst/goalsAgainst + shotsAgainst
    except ZeroDivisionError:
        return -1

def for_ratio(goalsFor, shotsFor):
    try:
        return goalsFor/shotsFor
    except ZeroDivisionError:
        return -1

for item, item2, item3, item4, item5 in zip(data, data2, data3, data4, data5):    
    row = (
        item['teamAbbrev'],
        item['teamFullName'],
        item['opponentTeamAbbrev'],
        item['gameLocationCode'],
        item['gameId'],
        item['gameDate'],
        item['gamesPlayed'],
        item['goalsFor'],
        item['shotsFor'],
         # Function contains try-catch block
        for_ratio(item['goalsFor'],item['shotsFor']),
        item['goalsAgainst'],
        item['shotsAgainst'],
         #  Function contains try-catch block
        save_ratio(item['shotsAgainst'], item['goalsAgainst']),
        item['wins'],
        item['losses'],
        item['otLosses'],
        item['shootoutGamesWon'],
        item['shootoutGamesLost'],
        item['ppOpportunities'],
        item['ppGoalsFor'],
        item['ppPctg'],
        item['shNumTimes'],
        item['ppGoalsAgainst'],
        item['penaltyKillPctg'],
        item['points'],
        item['faceoffsWon'],
        item['faceoffsLost'],
        item['faceoffWinPctg'],
        item['teamId'],

        item2['blockedShots'],
        item2['giveaways'],
        item2['takeaways'],
        item2['hits'],

        item3['daysBtwGamesGroup'],

        item4['enGoalsFor'],
        item4['evGoalsFor'],
        item4['otGoals'],
        item4['ppGoalsFor'],
        item4['shGoalsFor'],

        item5['shotAttempts'],
        item5['shotAttemptsAgainst'],
        item5['shotAttemptsAhead'],
        item5['shotAttemptsBehind'],
        item5['shotAttemptsClose'],
        item5['shotAttemptsFor'],
        item5['shotAttemptsTied'],
        item5['unblockedShotAttempts'],
        item5['unblockedShotAttemptsAgainst'],
        item5['unblockedShotAttemptsAhead'],
        item5['unblockedShotAttemptsBehind'],
        item5['unblockedShotAttemptsClose'],
        item5['unblockedShotAttemptsFor'],
        item5['unblockedShotAttemptsTied'],        
        )
    writer.writerow(row)
