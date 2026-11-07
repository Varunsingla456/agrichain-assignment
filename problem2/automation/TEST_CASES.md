# Problem 2 — Test cases
## Manual
Do these by looking at the page. A person has to judge the layout.

| ID | What to check | Expected 
|
| --- | --- | --- |
| TC_MAN_001 | Input page against the wireframe | Logo, Agrichain, Login, Register, the text box, and Submit are in place 
|
| TC_MAN_002 | Result page against the wireframe | Output is:, the length, and Back to Home are in place 
|
| TC_MAN_003 | Hint text in the box | Enter String Input... 
|
| TC_MAN_004 | Use the page without logging in | The page works. It does not force Login or Register 
|
## Automation
These have a fixed input and a fixed length. Only TC_AUTO_001 is automated. The script types abcabcbb, clicks Submit, and checks Agrichain, Login, Register, Output is:, the length 3, and Back to Home.

| ID | Input | Length 
|
| --- | --- | --- |
| TC_AUTO_001 | abcabcbb | 3 
|
| TC_AUTO_002 | bbbbb | 1 
|
| TC_AUTO_003 | pwwkew | 3 
|
| TC_AUTO_004 | empty box | 0 
|
| TC_AUTO_005 | a | 1 
|
| TC_AUTO_006 | abcABC | 6 
|