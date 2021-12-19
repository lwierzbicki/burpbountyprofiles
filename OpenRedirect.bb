[
  {
    "ProfileName": "OpenRedirect",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,%2F%09%2Fevil.com",
      "true,%2F%10%2Fevil.com",
      "true,%2F%13%2Fevil.com",
      "true,evil.com",
      "true,/evil.com",
      "true,//evil.com",
      "true,///evil.com",
      "true,////evil.com",
      "true,/\\evil.com",
      "true,%2fevil.com",
      "true,%2f$2fevil.com",
      "true,%2fevil.com%2f%2f",
      "true,$2f%2fevil.com%2f%2f",
      "true,%2fevil.com//",
      "true,http://example.com%0a%23.evil.com"
    ],
    "Encoder": [
      " "
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,location.*evil.com"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 9,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "Open Redirect with payload: \u003cbr\u003e\u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]