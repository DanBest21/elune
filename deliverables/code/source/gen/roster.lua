local menu = {{text = "Select an Option", isTitle = true}, {text = "Option 1", func = function () print("You've chosen option 1"); end}, {text = "Option 2", func = function () print("You've chosen option 2"); end}, {text = "More Options", hasArrow = true, menuList = {{text = "Option 3", func = function () print("You've chosen option 3"); end}}}}
local menuFrame = CreateFrame("Frame", "ExampleMenuFrame", UIParent, "UIDropDownMenuTemplate")
EasyMenu(menu, menuFrame, "cursor", 0, 0, "MENU")
