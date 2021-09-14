# Analysing AWS ALB Access logs

Its daunting when your system visibility is less. Especially true when its AWS ALB and not your system to make changes. 

Luckily, ALB does provide access logs which can be stored in S3 and can be further analysed via Athena. We can't cover in this article hence focusing only on how to get your access logs from S3 into Athena and perform some analysis.


## Problem

Let's say customers are reporting your system is returning errors but your system logs show no sign of errors. Best course of action is start with each layer (Gateway, Route53, and ALB) and find where the errors are originating.

Lets say, your customers confirms that its a 400 error and you need to know more here. Thats where ALB logs comes in handy.

## ALB Access Logs

A bit of introduction to AWS ALB Access Logs will certainly help you in the visibility. 

