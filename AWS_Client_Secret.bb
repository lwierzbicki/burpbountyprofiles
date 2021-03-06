[
  {
    "ProfileName": "AWS_Client_Secret",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@six2dez1",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,(SecretAccessKey|aws_secret_access_key)",
      "true,Or,(?i)(aws_access_key_id|aws_secret_access_key)(.{0,20})?\u003d.[0-9a-zA-Z\\/+]{20,40}"
    ],
    "Tags": [
      "All",
      "Cloud"
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
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "text/css,image/jpeg,image/png,image/svg+xml,image/gif,image/tiff,image/webp,image/x-icon,application/font-woff,image/vnd.microsoft.icon,font/ttf,font/woff2",
    "HttpResponseCode": "",
    "NegativeCT": true,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "AWS Client Secret",
    "IssueSeverity": "Information",
    "IssueConfidence": "Certain",
    "IssueDetail": "AWS Client Secret",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]