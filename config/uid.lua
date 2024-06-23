local function beta_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("UIRoot/AboveDialog/BetaHintDialog(Clone)")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            textComponent.text = "<size=25><color=#FFC0CB>JokerSR - LC</color></size>"
        else
            -- log:write("No Text component found on the game object")
        end
    else
        -- log:write("Game object not found")
    end
end

local function mhy_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("IDMAP1")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.MessageBoxDialogUtil))

        if textComponent then
            textComponent.ShowAboveDialogText = false
        else
            -- log:write("No Text component found on the game object")
        end
    else
        -- log:write("Game object not found")
    end
end

beta_text()
mhy_text()