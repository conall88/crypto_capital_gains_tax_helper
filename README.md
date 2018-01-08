(MIT License info at bottom)

## WHAT IS CRYPTO_CAPITAL_GAINS_TAX_HELPER?

This (Java/Maven) repo contains a couple of executable Java classes (scripts, really) that are designed to assist in the preparation of US taxes for people who have sold crypto assests by parsing, unifiying and analyzing exported exchange files.

### DISCLAIMERS

**This is extremely new software and does a lot of file/string parsing which may not work &quot;out of the box&quot;.**  **BE PREPARED FOR FRUSTRATION.**  **More importantly,**  **be prepared to communicate.**  **Talk to us via Github to describe the issues you experience and we will try to iron out the wrinkles in all these different file formats. Include as much information as possible.**

**Nothing in this repo should be considered legal advice. I&#39;m not an attorney and a real attorney may have entirely different ideas of how things work.**

**I make no guarantees or assertions of fitness for this software at all. Use at your own risk.**

note: The code is purposefully verbose and kept into just a few files and functions for readability and editability. It is meant to read like a top-to-bottom script execution.

### SUPPORTED EXCHANGES

- COINBASE
- GDAX
- GEMINI
- POLONIEX

Small numbers of transactions from other exchanges, on-chain activities (ICOs, etc), or miscellaneous (in-person buys and sell, etc) can be included manually. 

Suggest other exchanges via Github at https://github.com/fivedogit/crypto_capital_gains_tax_helper/issues . Include example file formats.

### ASSUMPTIONS

The above disclaimers notwithstanding, I had to make a few legal(-ish) assumptions when writing these scripts:

- ST vs LT - Assets held for more than a year fall under Long Term Capital Gains (LTCG). Assets held for less than a year fall under Short Term Capital Gains (STCG).
- Taxable events - Crypto-to-crypto exchanges (e.g. BTC to ETH) are taxable events and &quot;reset the clock&quot; for determination of long vs short. Moving a particular crypto from one exchange to another or to/from wallets does not trigger a taxable event.
- FIFO - Your earliest acquisition of a particular crypto is used first when you sell (or trade) any of that crypto.
- Income - If you were paid in crypto (mining, dApp income, simple payment for a job, etc), then you have to pay taxes on that as income elsewhere. It shows up in this list once you have it and its cost basis is its price at that time. (Note these have to be entered manually.)

### HOW IT WORKS

This repo comes with two executable Java classes:

1. HistoryAssembler - Assembles all of your transactions (from various exchanges, and manual entries) into a single JSON file, complete with the BTC and USD values as pulled from GDAX and Poloniex APIs. (no auth needed)
2. HistoryAnalyzer - Reads the JSON file and generates a CSV file of all your sell events, complete with the cost basis of each sale and its ST/LT determination (among other things).

### IS CRYPTO_CAPITAL_GAINS_TAX_HELPER RIGHT FOR YOU? 

- You are American (US) or USD works for you and ST/LT rules are similar.
- You used Coinbase, GDAX, Poloniex and Gemini only. (Suggest others via Github, please.)
- Your Poloniex trades have either ETH or BTC on one side. (XMR not yet supported.)
- You did minimal on-chain transactions such as ICOs\*
- You had minimal non-exchange crypto events like getting paid in crypto, earning via Dapp, buying/selling in-person, etc\*

\*A few is fine as you can include these manually.

### HOW TO USE

- Make sure download this program from the official repo only. Never execute untrusted programs on your computer, especially if the computer contains crypto wallets.
  - Verify the URL is https://github.com/fivedogit/crypto_capital_gains_tax_helper
  - Verify the &quot;green&quot; certificate in the location bar.
- Download your exchange files and save them to a location on your computer. This program currently supports:
  - Coinbase - Download _each_ of your BTC, LTC and ETH &quot;Buys, sells and merchant payouts&quot; and rename them to &quot;Coinbase-ETH.csv&quot;, etc.
  - Poloniex - Download your &quot;trade history&quot;. (We don&#39;t care about transfers in/out.) and rename to &quot;Poloniex.csv&quot;
  - GDAX - Download each of your BTC, LTC and ETH histories from the &quot;fills&quot; page and rename them to &quot;GDAX-ETH.csv&quot;, etc.
  - Gemini - Download your unified history as xlsx, open in a spreadsheet program, export as CSV to &quot;Gemini.csv&quot;
- Open the &quot;AaayyConstantsEditMe.java&quot; file and rename the paths/filenames.
- Open HistoryAssembler and search for &quot;if(includeSpecial)&quot;. Remove everything in the block and add your own exceptions. I have provided many examples (in that block) from my own trevails:
  - Ethersale BTC→ETH purchase.
  - In-person USD→BTC purchase.
  - Dapp ETH income
  - Mining ETH income
  - Bounty ETH income
  - On-chain token (DAO) purchase.
  - ETC hard fork acquisition (Necessary to include because I sold it.)
  - OMG airdrop acquisition (Necessary to include because I sold it.)
- (optional, rare) Still in HistoryAssembler, if you need to exclude transactions found in your exchange files for any reason, search for &quot;if(excludeSpecial&quot; and follow the pattern there. In my example, I used timestamps (derived from epochconverter.com) to exclude purchases/trades I made on behalf of someone else.
  - It&#39;s better to specify the exclusions in the Java class than the exchange files so you can always download the exchange files fresh and not have to edit them again.
  - If you do this, ensure &quot;private boolean excludeSpecial = true;&quot; at the top of the class.
  - Make sure that the timestamp range you use doesn&#39;t include transactions you want to keep.
- Execute HistoryAssembler.
  - The first time you run this may take a while as it may need to ping outside data sources for BTC and USD info.
  - Note: The &quot;known ticks&quot; will save after each exchange file is processed successfully.
  - If you get parsing errors, don&#39;t edit your exchange files. Let me know on Github and I&#39;ll try to fix.
- Once HistoryAssembler is finished, you&#39;ll have three output files:
  - knownUsdPerBtcTicks.json
  - knownBtcPerEthTicks.json
  - unifiedHistory.json
- Now you can run HistoryAnalyzer. It should produce a relatively human readable output file (CSV) which you can import into a spreadsheet program.

----

Copyright 2018 Cyrus Adkisson

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.