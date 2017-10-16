export default {
  template: `
    <div>
        <h3>{{ character.name }}</h3>
        <div v-if="character.feats && character.feats.length" class="btn-group-vertical" data-toggle="buttons">
            <label v-for="feat of character.feats" class="btn btn-large btn-default">
                <input :name="feat.id" type="checkbox" autocomplete="off" checked> {{ feat.name }}
            </label>
        </div>

        <div v-if="conditions && conditions.length" class="btn-group-vertical" data-toggle="buttons">
            <label v-for="condition of conditions" class="btn btn-large btn-info">
                <input :name="condition.id" type="checkbox" autocomplete="off" checked> {{ condition.name }}
            </label>
        </div>

        <div v-if="circumstances && circumstances.length" class="btn-group-vertical" data-toggle="buttons">
            <label v-for="circumstance of circumstances" class="btn btn-large btn-success">
                <input :name="circumstance.id" type="checkbox" autocomplete="off" checked> {{ circumstance.name }}
            </label>
        </div>
    </div>
  `,
  data() {
    return {
      character: {
          name: 'Tarkonn',
          abilities: [
            { name: 'STR', score: 22, modifier: 6},
            { name: 'DEX', score: 16, modifier: 3},
            { name: 'CON', score: 14, modifier: 2},
            { name: 'INT', score: 14, modifier: 2},
            { name: 'WIS', score: 12, modifier: 1},
            { name: 'CHA', score: 7, modifier: -2}
          ],
          feats: [
            { id: 'feat[power-attack]', name: 'Power Attack' },
            { id: 'feat[furious-focus]', name: 'Furious Focus'},
            { id: 'feat[weapon-focus]', name: 'Weapon Focus'},
            { id: 'feat[shield-of-swings]', name: 'Shield of Swings'},
            { id: 'feat[combat-expertise]', name: 'Combat Expertise'}
          ]
      },
      conditions: [
        { id: 'condition[prone]', name: 'Prone' },
        { id: 'condition[grappled]', name: 'Grappled' },
        { id: 'condition[fatigued]', name: 'Fatigued' },
        { id: 'condition[exhausted]', name: 'Exhausted' }
      ],
      circumstances: [
        { id: 'circumstance[charging]', name: 'Charging' },
        { id: 'circumstance[flanking]', name: 'Flanking' },
        { id: 'circumstance[fighting-defensively]', name: 'Fighting Defensively' },
        { id: 'circumstance[total-defense]', name: 'Total Defense' }
      ]
    }
  }
}
